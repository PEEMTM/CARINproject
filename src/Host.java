import java.util.Random;

public class Host {
    int[][] map  = new int[5][5];
    int Antibodyleft ;
    int Virusleft ;
    public void Spaw(){
        Random rand = new Random() ;
        int percentspaw = rand.nextInt(100);
        System.out.println("Percent = "+percentspaw);
        if(percentspaw<70){
            int col = rand.nextInt(5);
            int row = rand.nextInt(5);
            while (true) {
                if(map[col][row]== 0){
                    System.out.println("(col,row) = "+col+" "+row);
                    map[col][row]= 1 ;
                    break;
                }else {
                    col++;
                }
                System.out.println("(col,row) = "+col+" "+row);
            }
        }
    }
    public  void PrintMap(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Host A = new Host();
        A.PrintMap();
        for(int i = 0;i<10;i++){
            A.Spaw() ;
            A.PrintMap();
        }
    }
}
