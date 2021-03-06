/*
 * 
  * Este arquivo pertence (e faz parte) ao/do Sthouch Project, que est� Licenciado com a MIT Licence (MIT).
  * 
  * Copyright (C) 2014 Sthouch Team <http://www.sthouch.org/ e contribuidores>
  * 
  * A permiss�o � concedida, a t�tulo gratuito, a qualquer pessoa que obtenha uma c�pia
  * deste software e arquivos de documenta��o associados (o "Software"), para negociar
  * o Software sem restri��o, incluindo, sem limita��o, os direitos
  * para usar, copiar, modificar, mesclar, publicar, distribuir, sublicenciar e/ou vender
  * c�pias do Software, e permitir que as pessoas a quem o Software �
  * fornecido fa�am isso, sujeito �s seguintes condi��es:
  *
  * ---------
  *
  * O aviso de copyright acima, os avisos abaixo, e este aviso de permiss�o devem ser inclu�dos em todas as c�pias ou partes 
  * substanciais do Software, obrigatoriamente;
  * 
  * Os Nome(s) dos detentores de direitos autorais acima dever� n�o poder ser usado em publicidade ou de outra forma para promover
  * a venda, uso ou outras negocia��es em Este Software sem autoriza��o pr�via por escrito, do L�der do Projeto.
  * 
  * O Intitulado Contribuidor do Projeto (Citado acima, no Copyright), �/s�o aquele/aqueles que fazem, ou, por sua vez,
  * fizeram parte da equipe oficial, sendo assim ent�o ou um dia, aceitos pela equipe oficial do  Sthouch como, por sua vez,
  * Contribu�ntes e Desenvolvedores do mesmo. Qualquer outro usu�rio que, por sua vez, n�o seja/esteja dentro/participando da
  * equipe oficial, ou nunca tenha participado oficialmente da equipe, n�o tem direitos como "contribuidores" ou "contribuinte" do
  * projeto Sthouch (ou Sthouch Project).
  * 
  * ---------
  * 
  * O SOFTWARE � FORNECIDO "COMO EST�", SEM GARANTIA DE QUALQUER TIPO, EXPRESSA OU IMPL�CITA, INCLUINDO, SEM LIMITA��O, 
  * AS GARANTIAS DE COMERCIALIZA��O,ADEQUA��O A UM DETERMINADO FIM E N�O VIOLA��O.
  * EM NENHUM CASO A AUTORES OU DETENTORES DOS DIREITOS AUTORAIS SER� RESPONS�VEL POR QUALQUER RECLAMA��O, DANOS OU OUTRAS
  * RESPONSABILIDADE, SEJA EM UMA A��O DE CUMPRIMENTO DE CONTRATO OU QUALQUER OUTRO MEIO, DE OU EM CONEX�O COM O SOFTWARE OU O 
  * USO OU OUTRAS NEGOCIA��ES O SOFTWARE.
  * 
  * MIT Licence (MIT), Fonte: < http://pt.wikipedia.org/wiki/Licen%C3%A7a_MIT >
 */

package org.sthouch.api.player;

/**
 * <p></b>Aqui � onde fica os tipos de GameMode disponiveis para um jogador.</b></p>
 * @author GabrielButarelo
 * @version 1.0
 */
public enum GameModeType {

	/**
	 * <p>Esse modo de jogo � o mais utilizado por players, player perde vida, n�o tem acesso a itens de forma facil a n�o ser craftando-os.</p>
	 */
	SURVIVAL(0), 

	/**
	 * <p>Esse modo de jogo � o mais utilizado pelos STAFFERS de um servidor, nesse modo de jogo voc� n�o morre, n�o tem fome, tem acesso
	 * a todos os itens do jogo de forma facil e rapida.</p>
	 */
	CREATIVE(1),

	/**
	 * <p>Esse modo de jogo � utilizado com mais frequencia por servidores Mini-Game, nesse modo de jogo voc� n�o pode quebrar certos itens/blocos
	 * E est� limitado a algumas coisas delimitadas pelo administrador do servidor.</p>
	 */
	ADVENTURE(2);

	private final int GAMEMODE;
	
	private GameModeType(final int gamemode){
		this.GAMEMODE = gamemode;
	}

	public int getGameModeID() {
		return GAMEMODE;
	}
	
	

}