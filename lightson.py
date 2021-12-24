
import threading
import random
import os
import time

mutex = threading.Lock()

yellow = []
red = []
green = []
blue = []


tree = list(open('tree.txt').read().rstrip())



def color(color):
    if color == 'red':
        return f'\003[91m*\033[0m'
    if color == 'blue':
        return f'\003[94m*\033[0m'
    if color == 'green':
        return f'\003[92m*\033[0m'
    if color == 'yellow':
        return f'\003[93m*\033[0m'

def ligthon(color, index):
    off = True
    while True:
        for index in index:
            tree[index] = color(color) if off else '*' 
            
        mutex.acquire()
        os.system('cls' if os.name == 'nt' else 'clear')
        print(''.join(tree))
        mutex.release()
        
        off = not off
        
        time.sleep(random.uniform(.5,1.5))
        
for i, c in enumerate(tree):
    if c == 'Y':
        yellow.append(i)
        tree[i] = '*'
    if c == 'G':
        green.append(i)
        tree[i] = '*'
    if c == 'R':
        red.append(i)
        tree[i] = '*'
    if c == 'B':
        blue.append(i)
        tree[i] = '*'
    
    
ty = threading.Thread(target=ligthon, args=('yellow', yellow), daemon=True)

tr = threading.Thread(target=ligthon, args=('red', red), daemon=True)

tg = threading.Thread(target=ligthon, args=('gree', green), daemon=True)

tb = threading.Thread(target=ligthon, args=('blue', blue), daemon=True)


for t in [ty, tr, tb, tg]:
    t.start()
for t in [ty,tr,tb,tg]:
    t.join()
