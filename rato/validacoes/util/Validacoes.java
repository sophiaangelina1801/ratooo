package com.sgp.util;

/**
 * Classe utilitária para validação de dados de entrada.
 * Contém métodos estáticos para validar nome, idade e espécie,
 * além de retornar mensagens de erro apropriadas.
 * 
 * Esta classe não pode ser instanciada (padrão Utility Class).
 */
public class Validacoes {


    /**
     * Construtor privado para impedir a criação de instâncias.
     * Segue o padrão de classe utilitária (Utility Class Pattern).
     */
    private Validacoes() {
        // Construtor privado para evitar instância
    }

    /**
     * Verifica se o nome informado é válido.
     * Um nome válido não pode ser nulo, vazio ou conter números.
     * 
     * @param nome O nome a ser validado
     * @return true se o nome for válido, false caso contrário
     */
    public static boolean nomeValido(String nome) {
        // Retorna false se o nome for nulo, vazio ou contiver dígitos
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    /**
     * Retorna uma mensagem de erro caso o nome seja inválido.
     * 
     * @param nome O nome a ser verificado
     * @return Mensagem de erro descritiva ou string vazia se válido
     */
    public static String mensagemErroNome(String nome) {
        // Verifica se o nome é nulo ou vazio
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: O nome não pode estar vazio!";
        // Verifica se o nome contém números usando regex
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: O nome não pode conter números!";
        }
        // Retorna string vazia se o nome for válido
        return "";
    }


   /**
     * Verifica se a espécie informado é válido.
     * Uma espécie válida não pode ser nula, vazia, conter números e não ser necessariamente uma espécie de rato.
     * 
     * @param especie A espécie a ser validada
     * @return true se a espécie for válida, false caso contrário
     */
    public static boolean especieValida(String especie) {
        // Retorna false se a espécie for nula, vazia ou contiver dígitos.
        return !(especie == null || especie.trim().isEmpty() || especie.matches(".*\\d+.*"));
    }

    /**
     * Verifica se a especie informada é válida.
     * A especie pode ser Sírio, Russo e Chinês.
     * @param especie A especie a ser verificada.   
     * @return Mensagem de erro descritiva ou string vazia se válida.
     */ 
    public static String mensagemErroEspecie(String especie) {
    // Verifica se a especie é nula, vazia ou se faz parte de alguma espécie mencionada.
    if (especie == null || especie.trim().isEmpty()) {
            return "Erro: a espécie não pode estar vazia!";
    // Verifica se a espécie contém números usando regex
    } else if (especie.matches(".*\\d+.*")) {
         return "Erro: a espécie não pode conter números!";
    }
    // Retorna string vazia se a espécie for válida
        return "";
    }


    /**
     * Verifica se a idade informada é válida.
     * A idade deve estar entre 0 e 5 anos.
     * 
     * @param idade A idade a ser validada
     * @return true se a idade estiver no intervalo válido, false caso contrário
     */
    public static boolean idadeValida(int idade) {
        // Idade válida: entre 0 e 5 anos 
        return idade >= 0 && idade <= 5;
    }

    /**
     * Retorna uma mensagem de erro caso a idade seja inválida.
     * 
     * @param idade A idade a ser verificada
     * @return Mensagem de erro descritiva ou string vazia se válida
     */
    public static String mensagemErroIdade(int idade) {
        // Verifica se a idade é negativa
        if (idade < 0) {
            return "Erro: A idade não pode ser negativa!";
        // Verifica se a idade excede o limite máximo
        } else if (idade > 5) {
            return "Erro: Idade inválida!";
        }
        // Retorna string vazia se a idade for válida
        return "";
    }


}