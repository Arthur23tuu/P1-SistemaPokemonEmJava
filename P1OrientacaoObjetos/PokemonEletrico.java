public class PokemonEletrico extends Pokemon{
    
    //método construtor
    public PokemonEletrico() {
        super("Pikachu", 110, 95);
    }

    //método atacar com override
    @Override
    public void atacar(Pokemon alvo) {

        System.out.println(this.getNome() + " usou Thunderbolt contra " + alvo.getNome() + "!");

        int vidaQueSobrou = alvo.getHp() - this.getAtaque();

        alvo.setHp(Math.max(0, vidaQueSobrou));

        System.out.println(alvo.getNome() + " ficou com " + alvo.getHp() + " de HP.\n");
    }
}
