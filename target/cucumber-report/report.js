$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ExcluirNota.feature");
formatter.feature({
  "name": "Google keep",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Dado que eu aciono o get started",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Arrastar nota para direita",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cenarioScrool"
    }
  ]
});
formatter.step({
  "name": "eu arrastar a nota para a direita",
  "keyword": "Quando "
});
formatter.match({
  "location": "ExcluirNotaSteps.euArrastarANotaParaADireita()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});