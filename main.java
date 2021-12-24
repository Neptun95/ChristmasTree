import java.util.Random;

public class main{


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    enum ColorEnum {
        GREEN,
        BLUE,
        RED,
        YELLOW,
        CYAN;

        public static ColorEnum generateRandomColor() {
            ColorEnum[] values = ColorEnum.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex];
        }
    }


    public static void main(String[] args) {
       
            System.out.println();
            System.out.println();
            System.out.println();
            for(int i = 0; i<10;i++){
                for(int j=0;j<10-i;j++)
                    System.out.print(" ");
                for(int k=0;k<(2*i+1);k++)
                    if(ColorEnum.generateRandomColor() == ColorEnum.BLUE){
                    System.out.print( ANSI_BLUE + "*" + ANSI_RESET);
                }
                else if(ColorEnum.generateRandomColor() == ColorEnum.RED){
                    System.out.print( ANSI_RED + "*" + ANSI_RESET);
                }
                else if(ColorEnum.generateRandomColor() == ColorEnum.YELLOW){
                    System.out.print( ANSI_YELLOW + "*" + ANSI_RESET);
                }
                else if(ColorEnum.generateRandomColor() == ColorEnum.GREEN){
                    System.out.print( ANSI_GREEN + "*" + ANSI_RESET);
                }
                else if(ColorEnum.generateRandomColor() == ColorEnum.CYAN){
                    System.out.print( ANSI_CYAN + "*" + ANSI_RESET);
                }
                else{
                    System.err.print('*');
                }
                System.out.println();
            }
        System.out.println("         ||   ");
        System.out.println("   MERRY CHRISTMAS"); 
        System.out.println();
        System.out.println();;
        }   
}
    