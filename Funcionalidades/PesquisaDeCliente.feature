#language: pt
#encoding: iso-8859-1

Funcionalidade: Pesquisa de Cliente
	Como um usuário do sistema
	Eu quero pesquisar os dados de um cliente
	Para que eu possa gerenciar o cliente
	
		Esquema do Cenário: Pesquisa de Cliente por CPF
		Permite realizar a pesquisa de um cliente atraves do CPF
		
		Dado Acessar a página de pesquisa de Cliente
		E Informar o CPF <cpf>
		Quando Solicitar a realização da pesquisa
		Então Sistema exibe o nome do cliente <nome>
		E Sistema exibe a data de nascimento do cliente <datanascimento>
		E Sistema exibe o email do cliente <email>
		
		Exemplos:
		|       cpf        |       nome     | datanascimento |          email          |
		| "123.456.789-00" | "Ana Paula"    | "10/02/1990"   | "anapaula@gmail.com"    |
		| "456.789.123-00" | "Pedro Carlos" | "12/06/1985"   | "pedrocarlos@gmail.com" |
		| "789.123.456-00" | "Maria Souza"  | "20/08/1984"   | "mariasouza@gmail.com"  |
		
		
		
