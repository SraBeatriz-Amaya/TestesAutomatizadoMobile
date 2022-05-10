#language: pt
#enconding:UTF-8


Funcionalidade: Google keep

Contexto: Dado que eu aciono o get started

@CriarNota
Cenario: Criar uma nota
Quando eu acionar o new a note
E eu informar no campo title "Nota1"
E eu informar no campo note "Nota"
E eu acionar o botao voltar
Entao o aplicativo cadastra a nota com o titulo "Nota1"


