Feature: Validade Email User

Background:
Given I'm already logged in

Scenario Outline: Using Different e-mails

And I click on the 'Convidar Usuarios' button
And click on the 'Gerenciar usuarios' tab
And Click on the 'Criar Nova Conta' button
When I fill up the userName <userName> on the form
And I fill up the realName <realName> on the form
And I fill up the email <email> on the form
And Click on the 'Criar Usuario' button
Then Will validate the user

Examples:

| userName | realName | 		email			   |
|test1     | correct  | raynan@base2.com.br        |
|test2     | invalid  | raynan.mirandabase2.com.br |
|test3     | invalid  | raynan.miranda@            |
|test4     | invalid  | raynan.miranda@base2.com,  |
|test5     | SameEmail| raynan@base2.com.br        |