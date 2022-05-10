#language: pt
#enconding:UTF-8

@cenarioEditarNota
Funcionalidade: Google keep

Contexto: Dado que eu aciono o get started

Cenario: Editar uma nota
Quando eu acionar a nota
E eu informar no campo title "NotaEditada"
E eu informar no campo note "NotaEditadaNota"
Entao o aplicativo cadastra a nota com o titulo "NotaEditada"


