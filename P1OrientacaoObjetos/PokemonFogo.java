public class PokemonFogo extends Pokemon{//herança

    //método construtor
    public PokemonFogo() {
        super("Charizard", 150, 120);
    }

    //método atacar com override
    //reescrita de método
    @Override
    public void atacar(Pokemon alvo) {

        System.out.println(this.getNome() + " usou Fire Blast contra " + alvo.getNome() + "!");

        int vidaQueSobrou = alvo.getHp() - this.getAtaque();

        alvo.setHp(Math.max(0, vidaQueSobrou));

        System.out.println(alvo.getNome() + " ficou com " + alvo.getHp() + " de HP.\n");
    }
}
