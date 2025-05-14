👨‍🏫 Instruções gerais:

Crie um diretório chamado lab-04 no seu repositório do GitHub Classroom.

Dentro de cada exercício, crie um subdiretório com um projeto Gradle.

Cada exercício deve conter uma classe com método main() para testar o funcionamento da classe principal.

Faça um commit após a conclusão de cada exercício.

🧩 1. Classe Retangulo
Crie uma classe Retangulo com os seguintes atributos:

base (double)

altura (double)

Implemente:

Construtor que inicialize os dois atributos.

Métodos get e set para ambos os atributos.

Método toString() que retorne as dimensões do retângulo.

Método calcularArea() que retorne a área.

Método calcularPerimetro() que retorne o perímetro.

Verificação no set para impedir valores negativos.

📏 2. Classe Cilindro
Crie uma classe Cilindro que utilize um objeto da classe Retangulo para representar a base (como se fosse a base circular desenvolvida em um retângulo).

Adicione o atributo altura (double).

O construtor deve receber um objeto Retangulo e a altura.

Método calcularVolume() que calcula o volume como base.getArea() * altura.

Método toString() que inclua as informações da base e da altura.

🧠 3. Classe Aluno
Crie a classe Aluno com os seguintes atributos:

nome (String)

matricula (String)

notas (vetor de 3 doubles)

Implemente:

Construtor que receba nome e matrícula, inicialize as notas como zero.

Métodos get e set para as notas (com validação de 0 a 10).

Método calcularMedia()

Método foiAprovado() (retorna true se a média ≥ 7)

Método toString() com nome, matrícula e média final.

📚 4. Classe Turma
Crie uma classe Turma que contenha:

Um vetor de até 5 objetos Aluno

Um método adicionarAluno(Aluno aluno)

Um método listarAprovados(), que imprime os dados dos alunos aprovados

Um método mediaDaTurma(), que retorna a média geral da turma.
