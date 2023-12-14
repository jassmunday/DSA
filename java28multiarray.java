public class java28multiarray {

    public static void main(String[] args) {

        String [][] student = new String[2][2];
        student[0][0]="Hens";
        student[0][1]="45";
        student[1][0]="Anmol";
        student[1][1]="39";
         for (int i=0;i<=student.length-1;i++){
             for (int j=0;j<=student[i].length-1;j++){
                 System.out.println(student[i][j]);

             }
         }


    }
}
