#language: pt
#enconding:UTF-8


Funcionalidade: Google keep


Contexto: Dado que eu aciono o get started

@cenarioExcluirNota
Cenario: Excluir uma nota
Quando eu tocar e segura a nota
E eu tocar nas opcoes
E eu tocar em deletar
Entao o sistema adiciona a nota na lixeira

@ScrollTeste
Cenario: clicar no scroll teste
Quando eu clicar na nota scroll teste

@cenarioScrool
Cenario: Arrastar nota para direita
Quando eu arrastar a nota para a direita
