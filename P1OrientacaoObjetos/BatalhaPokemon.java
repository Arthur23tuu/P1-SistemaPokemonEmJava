public class BatalhaPokemon {
    public static void main(String[] args) {
        //criando objeto
        PokemonFogo c = new PokemonFogo();
        PokemonPlanta v = new PokemonPlanta();
        PokemonEletrico p = new PokemonEletrico();
        PokemonAgua b = new PokemonAgua();

        System.out.println("__________________________________\n");
        System.out.println("Todas as batalhas aqui descritas desconsideram fraquezas e resistências.\n");
        System.out.println("__________________________________\n");

        //usando o método
        System.out.println("Batalha entre " + c.getNome() + " Lv.50 e " + v.getNome() + " Lv.50!\n ----> Semifinal\n");
        System.out.println(c.getNome() + " entrou na arena\n" + v.getNome() + " entrou na arena\nVai Começar!\n");
        c.atacar();
        v.atacar(c);
        c.atacar(v);
        v.atacar();
        c.atacar(v);
        System.out.println("Fim da batalha!\nVencedor: " + c.getNome() + "!\n");
        c.setHp(150);//curando pokémon
        v.setHp(160);


        System.out.println("__________________________________\n");
        System.out.println("Batalha entre " + p.getNome() + " Lv.50 e " + b.getNome() + " Lv.50!\n ----> Semifinal\n");
        System.out.println(p.getNome() + " entrou na arena\n" + b.getNome() + " entrou na arena\nVai Começar!\n");
        p.atacar(b);
        b.atacar(p);
        p.atacar();
        b.atacar(p);
        System.out.println("Fim da batalha!\nVencedor: " + b.getNome() + "!\n");
        p.setHp(110);
        b.setHp(155);


        System.out.println("__________________________________\n");
        System.out.println("Batalha entre " + c.getNome() + " Lv.50 e " + b.getNome() + " Lv.50!\n ----> Grande Final\n");
        System.out.println(c.getNome() + " entrou na arena\n" + b.getNome() + " entrou na arena\nVai Começar!\n");
        c.atacar();
        b.atacar();
        c.atacar();
        b.atacar(c);
        c.atacar(b);
        b.atacar();
        c.atacar(b);
        System.out.println("Fim da batalha!\nGrande Vencedor: " + c.getNome() + "!\n");
        c.setHp(150);
        b.setHp(155);

    }
    
}
