# language: pt
Funcionalidade: Simular seguro de veiculo
Como cliente eu quer avaliar o seguro do meu veiculo

	
  Cenario: Deve acessar a pagina e preencher os formularios
    Dado que acesse no site "http://sampleapp.tricentis.com/101/app.php"
    E que o formulario, aba enter  Automobile
    E selecione a marca do veiculo "BMW"
    E preencha o campoa pontenica "2.8"
    E infrome o ano de fabircacao "01/01/2021"
    E infrome a quantidade de passageiros 5
    E selecione o timpo do combustivel "Gas"
    E informe o preco de tabela 45000
    E o numero da licenca 00000021
    E a quantas em milhas ano 300
    Entao pressione o botao "next"

	@ignore
  Cenario: Deve preencher formulario Insurant Data
    Dado que o formulario, aba enter Insurant Data
    Quando informe o nome "Antony"
    E informe o sobre nome "Santiago"
    E infome sua data de nascimento 05/30/1990
    E selecione seu genro Male
    E informe o seu endereco "street" 94
    E informe o pais "Brazil"
    E informe o codigo postal 7000000
    E informe a cidade "Brasilia"
    E selecionar a ocupacao "Public Official"
    E selecinar o hobbies "Other"
    E infomar a website "test.com"
    Entao pressione o botao "next"
	
	@ignore
  Cenario: preencha o formulario product Data
    Dado que o formulário, aba enter Product Data
    E informar a data inicial 10/26/2022
    E selecionar a soma do suguro 3.000.000,00
    E selecionar a classificaçaoBunos 1
    E selecionar o seguro contra danos "No Coverage"
    E produto opcional "Euro Protection"
    E Selecionar carro de cortesia "Yes"
    Entao pressione o botao "next"

	@ignore
  Cenario: preencha o formulario price Data
    Dado Preencher o formulario, "aba Select Price Option"
    Quando Selecionar o "plano platinum"
    Entao pressione o botao "next"

	@ignore
  Cenario: preencha o formulario send quote
    Dado que o formulario, aba Send Quote
    Quando informar o e-mail "teste@gmail.com"
    E informar o telefone 6198888888
    E informar a senhar "Teste1234"
    E confirmar a senhar "Teste1234"
    E comentar "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    E pressione o botao "Send"
    Entao Verificar a mensagem "Sending e-mail success!"na tela