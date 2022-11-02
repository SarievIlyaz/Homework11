public class Triangle {

    int a;
    int b;
    int c;

    public void area () {
        double d = a+b+c;
        double f = d/2;
        double h = Math.sqrt(f*(f-a)*(f-b)*(f-c));
        System.out.println("Ploshad treugolnika: "+h);
    }
}
