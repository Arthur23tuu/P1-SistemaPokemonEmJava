public class PokemonPlanta extends Pokemon{

    //método construtor
    public PokemonPlanta() {
        super("Venusaur", 160, 120);
    }

    //método atacar com override
    @Override
    public void atacar(Pokemon alvo) {

        System.out.println(this.getNome() + " usou Solar Beam contra " + alvo.getNome() + "!");

        int vidaQueSobrou = alvo.getHp() - this.getAtaque();

        alvo.setHp(Math.max(0, vidaQueSobrou));

        System.out.println(alvo.getNome() + " ficou com " + alvo.getHp() + " de HP.\n");
    }
}
