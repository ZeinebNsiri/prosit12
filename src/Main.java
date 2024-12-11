import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Consumer<Etudiant> con = student -> System.out.println(student);
        Function<Etudiant, String> fun = student -> student.getNom();

        Supplier<Etudiant> sup = () -> new Etudiant();
        Comparator<Etudiant> com = (student1, student2) -> student1.getId()-student2.getId();

        Etudiant zeineb = new Etudiant( 1, "zeineb", 22 );
        Etudiant zeineb2 = new Etudiant( 2, "zeineb2", 22 );
        Etudiant zeineb3 = new Etudiant( 3, "zeineb3", 22 );
        con.accept(zeineb);
        con.accept(zeineb2);
        con.accept(zeineb3);
        fun.apply(zeineb);
        fun.apply(zeineb2);
        fun.apply(zeineb3);

    }
}

