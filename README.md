Revisão de Java 2026 ☕

Repositório criado para revisar Java desde os fundamentos, praticando lógica de programação, algoritmos e os principais recursos da linguagem.

Objetivos

Reforçar os fundamentos de lógica de programação;

revisar a sintaxe e os recursos do Java;

praticar por meio de exemplos pequenos e independentes;

acompanhar a evolução dos estudos;

manter uma referência para consultas futuras.

Conteúdos

Fundamentos

Estrutura básica de um programa

Saída de dados

Variáveis e tipos de dados

Constantes

Concatenação e formatação de texto

Entrada de dados com Scanner

Operadores aritméticos

Operadores relacionais

Operadores lógicos

Estruturas de controle

Condicionais com if, else if e else

Operador ternário

Estrutura switch

Laços for, while e do-while

Próximos tópicos

Arrays e matrizes

Métodos

Programação orientada a objetos

Collections

Tratamento de exceções

Streams e expressões lambda

Testes automatizados

Estrutura do projeto

revisao-java-2026/
├── .vscode/
│   └── settings.json
├── src/
│   ├── fundamentos/
│   │   ├── Concatenacao.java
│   │   ├── Constantes.java
│   │   ├── EntradaDeDados.java
│   │   ├── EstruturaBasica.java
│   │   ├── OlaMundo.java
│   │   ├── OperadoresAritmeticos.java
│   │   ├── OperadoresLogicos.java
│   │   ├── OperadoresRelacionais.java
│   │   └── Variaveis.java
│   └── controle/
│       ├── Condicionais.java
│       └── OperadorTernario.java
├── .gitignore
└── README.md

Os arquivos estão organizados em pacotes de acordo com o assunto. Cada exemplo possui seu próprio método main e pode ser executado separadamente.

Pré-requisitos

JDK 17 ou superior;

Git;

VS Code com o Extension Pack for Java, ou outra IDE Java.

Confira a instalação:

java -version
javac -version
git --version

Como clonar

cd "C:\Users\Luis Scopo\Desktop\projetos\estudos"
git clone https://github.com/LuisdsSantos/revisao-java-2026.git
cd revisao-java-2026
code .

Configuração do VS Code

O arquivo .vscode/settings.json define src como a raiz do código-fonte:

{
    "java.project.sourcePaths": [
        "src"
    ],
    "java.project.outputPath": "bin"
}

Com essa configuração, as pastas correspondem aos pacotes:

Pasta

Declaração do pacote

src/fundamentos

package fundamentos;

src/controle

package controle;

Como executar

No VS Code, abra uma classe que contenha o método main e clique em Run.

Para compilar todos os exemplos pelo PowerShell:

javac -d bin (Get-ChildItem -Path src -Recurse -Filter *.java).FullName

Depois, execute uma classe informando o pacote e o nome da classe:

java -cp bin fundamentos.OlaMundo

Outro exemplo:

java -cp bin controle.Condicionais

Padrão de commits

Este projeto utiliza Conventional Commits:

<tipo>: <descrição curta>

Tipos mais utilizados:

Tipo

Uso

feat

Adição de um novo exemplo ou conteúdo

fix

Correção de um problema no código

docs

Alteração na documentação

refactor

Reorganização ou melhoria interna do código

test

Adição ou alteração de testes

chore

Configurações e tarefas de manutenção

Exemplos:

feat: adiciona exemplo de estrutura switch
fix: corrige comparacao de strings
docs: atualiza trilha de estudos
refactor: reorganiza exemplos por assunto
chore: configura projeto Java no VS Code

Convenções de código

Classes em PascalCase;

variáveis e métodos em camelCase;

constantes em UPPER_SNAKE_CASE;

nomes claros e descritivos;

um assunto principal por exemplo;

pacotes organizados por tema.

Autor

Desenvolvido por Luis Santos durante sua revisão de Java em 2026.