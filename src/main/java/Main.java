import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso java script");
        curso2.setDescricao("descricao curso java script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAleteia = new Dev();
        devAleteia.setNome("Aleteia");
        devAleteia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Aleteia" + devAleteia.getConteudoInscritos());
        devAleteia.progredir();
        devAleteia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Aleteia" + devAleteia.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Aleteia" + devAleteia.getConteudosConcluidos());
        System.out.println("XP:" + devAleteia.calcularTotalXp());

        System.out.println("---------------");

        Dev devAllan = new Dev();
        devAllan.setNome("Allan");
        devAllan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Allan" + devAllan.getConteudoInscritos());
        devAllan.progredir();
        devAllan.progredir();
        devAllan.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Allan" + devAllan.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Allan" + devAllan.getConteudosConcluidos());
        System.out.println("XP:" + devAllan.calcularTotalXp());

    }
}
