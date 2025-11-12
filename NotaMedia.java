public class NotaMedia {

    public static double[] notaMedia(int[][] notas){
        double[] notasMedias = new double[notas.length];

        for(int i=0; i<notas.length; i++){
             int[] notaAlumno = notas[i];
             int suma = 0;

             for(int j=0; j<notaAlumno.length; j++){
               suma += notaAlumno[j];
             }
          double notaMedia = (double)suma/notaAlumno.length;

          double redondear = Math.round(notaMedia*10.0)/10.0;
          notasMedias[i] = redondear;

        }
        return notasMedias;
    }
    public static void main(String[] args) {
        int [][] notasAlumnos = new int[][]{
            {3,4,5},
            {9,2,3},
            {5,6,1},
            {8,6,1}
        };

        notaMedia(notasAlumnos);

        double[] resultado = notaMedia(notasAlumnos);
        for(int i=0; i<resultado.length; i++){
          
            System.out.println(resultado[i]);
        }
    }
    
}
