package Lanchonete.atendimento.cozinha;

import Lanchonete.atendimento.Atentente;
import Lanchonete.atendimento.cozinha.Almoxarife;

public class Cozinheiro {
    public static void main(String[] args) {
        
    }
    public void adicionarNoBalcao(){
        System.out.println("Adicionando lanche natural hamburger no balcão");
    }
    public void adicionarSucoNoBalcao () {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao(){
        adicionarNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando lanche tipo hamburguer");
    }
    private void prepararVitamina(){
        System.out.println("Preparando vitamina");
    }
    private void prepararCombo () {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionndo o pão, salada, ovo e carne");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingresientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador");
    }
    private void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e ovo para o hamburger");
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entrgarIngredientes();
    }
}
