public class PokemonAgua extends Pokemon{
    
    //método construtor
    public PokemonAgua() {
        super("Blastoise", 155, 95);
    }

    //método atacar com override
    @Override
    public void atacar(Pokemon alvo) {

        System.out.println(this.getNome() + " usou Surf contra " + alvo.getNome() + "!");

        int vidaQueSobrou = alvo.getHp() - this.getAtaque();

        alvo.setHp(Math.max(0, vidaQueSobrou));

        System.out.println(alvo.getNome() + " ficou com " + alvo.getHp() + " de HP.\n");
    }
}
