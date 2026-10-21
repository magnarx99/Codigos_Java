public class operadores_logicos {
    public static void main(String[] args) {
        boolean negacion = !false;
        System.out.println(negacion);
        boolean sumaLogica = true | false;
        System.out.println(sumaLogica); 
        boolean sumalogicaExclisiva = (5 == 5) ^ (5 < 4);
        System.out.println(sumalogicaExclisiva);
        boolean pronductoLogico = (5 == 5) & (5 < 4);
        System.out.println(pronductoLogico);
        boolean condicion1 = true;
        boolean condicion2 = false;
        boolean sumaLogicaCortocircuito = condicion1 || condicion2;
        System.out.println(sumaLogicaCortocircuito);
        boolean productoLogicoCortocircuito = (5 >= 5) && (5 < 4);
        System.out.println(productoLogicoCortocircuito);
    }
}
