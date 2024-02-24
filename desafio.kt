enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val dificuldade = Nivel.BASICO
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    val conteudos = listOf(
            ConteudoEducacional("Conteúdo 1"),
            ConteudoEducacional("Conteúdo 2"),
            ConteudoEducacional("Conteúdo 3")
    )

    val formacao = Formacao("Formação Kotlin", conteudos)
    val usuario = Usuario("Cesar")

    formacao.matricular(usuario)
}