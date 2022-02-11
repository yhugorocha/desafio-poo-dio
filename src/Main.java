import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao mentoria de java");
        mentoria.setData(LocalDate.now());

    //    System.out.println(curso1);
    //    System.out.println(curso2);
    //    System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Development");
        bootcamp.setDescricao("Conteudos sobre a linguagem java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHugo = new Dev();
        devHugo.setNome("Hugo");
        devHugo.increverBootCamp(bootcamp);

        System.out.println("Conteudos Incritos devHugo:"+ devHugo.getConteudosIncritos());
        devHugo.progredir();
        System.out.println("Conteudos Concluidos devHugo:"+ devHugo.getConteudosConcluidos());
        System.out.println("XP: "+devHugo.calcularTotalXp());

        Dev devFran = new Dev();
        devFran.setNome("Fran");
        devFran.increverBootCamp(bootcamp);

        System.out.println("Conteudos Incritos devFran:"+ devFran.getConteudosIncritos());
        devFran.progredir();
        devFran.progredir();
        System.out.println("Conteudos Concluidos devFran:"+ devFran.getConteudosConcluidos());
        System.out.println("XP: "+devFran.calcularTotalXp());



    }
}
