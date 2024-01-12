// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.addAll(usuarios)
        usuarios.forEach { usuario ->
            println("Usuário ${usuario.nome} matriculado na formação $nome - Nível: $nivel.")
        }
        println()
    }
	//Função para organização impressão das informações
    fun imprimirInformacoes() {
        println("Detalhes da Formação:")
        println("Nome: $nome")
        println("Nível: $nivel")
        println("Conteúdos:")
        conteudos.forEach { conteudo ->
            println("- ${conteudo.nome} (Duração: ${conteudo.duracao} minutos)")
        }
        println("\nInscritos na formação: ${inscritos.map { it.nome }}")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // Criando alguns objetos para simular cenários de teste
    val usuario1 = Usuario("Daniel Araujo")
    val usuario2 = Usuario("Eduardo Costa")
    val usuario3 = Usuario("Ana Paula")
    val usuario4 = Usuario("Luiz Augusto")

    val conteudo1 = ConteudoEducacional("Princípios de Agilidade e Desenvolvimento Colaborativo", 180)
    val conteudo2 = ConteudoEducacional("Aprendendo Kotlin na Prática em Sua Documentação Oficial", 240)
    val conteudo3 = ConteudoEducacional("Praticando Sua Lógida de Programação com Kotlin", 150)
	val conteudo4 = ConteudoEducacional("Explorando Padrões de Projeto com Kotlin", 300)
    
    
    val formacao1 = Formacao("Desenvolvimento Backend com Kotlin", Nivel.BASICO, listOf(conteudo1, conteudo2, conteudo3, conteudo4))

    // Matriculando vários usuários na formação
    formacao1.matricular(usuario1, usuario2, usuario3, usuario4)

    // Exibindo detalhes da formação
    formacao1.imprimirInformacoes()
}
