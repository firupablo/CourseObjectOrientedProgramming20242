public class ejecutar {
    public static void main(String[] args) {
        persona obj1 = new estudiante(1, "Juan", 20, 2, 10);
        persona obj2 = new estudiante(2, "Pedro", 21, 4, 11);
        persona obj3 = new estudiante(3, "harold", 22, 5, 12);
        persona obj4 = new estudiante(4, "Luis", 23, 6, 13);

        persona obj5 = new docente(1, "Maria", 30, 2, "Matematicas");
        persona obj6 = new docente(2, "Luisa", 31, 4, "Fisica");
        persona obj7 = new docente(3, "Laura", 32, 5, "Quimica");
        persona obj8 = new docente(4, "Lina", 33, 6, "Biologia");

        persona[] esudiantes = new persona[4];
        esudiantes[0] = obj1;
        esudiantes[1] = obj2;
        esudiantes[2] = obj3;
        esudiantes[3] = obj4;

        persona[] docentes = new persona[4];
        docentes[0] = obj5;
        docentes[1] = obj6;
        docentes[2] = obj7;
        docentes[3] = obj8;

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("////   esudianes    ////");

        for (int i = 0; i < esudiantes.length; i++) {
            System.out.println("");
            System.out.println(esudiantes[i].info());
            System.out.println(esudiantes[i].faltar());
        }

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("////   docentes    ////");

        for (int i = 0; i < docentes.length; i++) {
            System.out.println("");
            System.out.println(docentes[i].info());
            System.out.println(docentes[i].salario());
        }
    }
}
