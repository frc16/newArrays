public class NotaMedia {



    public static void main(String[] args) {

        
    int[][] notasAlumnos = new int[][]{
            {3,4,5},
            {9,2,3},
            {5,6,1},
            {8,6,1},
    };
    
    for(int i=0; i<notasAlumnos.length; i++){
    int[] notasAlumno =  notasAlumnos[i];

    int suma = 0;

    for(int j=0; j<notasAlumno.length; j++){
      
        suma += notasAlumno[j];
    }

     double notaMedia  = (double)suma/notasAlumno.length;
      double redondeado = Math.round(notaMedia*10.0)/10.0;

     System.out.println("alumno:" + (i+1) + " nota media: " + redondeado);
    }

}
 
}
