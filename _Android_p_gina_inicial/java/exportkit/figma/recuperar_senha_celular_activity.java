
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		p_gina_inicial
	 *	@date 		Tuesday 23rd of May 2023 06:52:43 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class recuperar_senha_celular_activity extends Activity {

	
	private View _bg__recuperar_senha_celular_ek2;
	private ImageView _dermagelogo_ek3;
	private View rectangle_56_ek2;
	private TextView esqueceu_a_senha__ek2;
	private TextView _email_ek3;
	private TextView celular_ek1;
	private TextView entre_com_o_seu_email_ou_n_mero_de_celular_e_te_mandaremos_um_link_para_recuperar_a_sua_conta__ek1;
	private View rectangle_103_ek4;
	private TextView enviar_ek1;
	private View line_5_ek1;
	private View line_6_ek1;
	private TextView _volte_para_acessar_a_sua_conta_ek1;
	private View rectangle_103_ek5;
	private TextView n_mero_de_celular_ek1;
	private TextView br__55;
	private View line_7;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.recuperar_senha_celular);

		
		_bg__recuperar_senha_celular_ek2 = (View) findViewById(R.id._bg__recuperar_senha_celular_ek2);
		_dermagelogo_ek3 = (ImageView) findViewById(R.id._dermagelogo_ek3);
		rectangle_56_ek2 = (View) findViewById(R.id.rectangle_56_ek2);
		esqueceu_a_senha__ek2 = (TextView) findViewById(R.id.esqueceu_a_senha__ek2);
		_email_ek3 = (TextView) findViewById(R.id._email_ek3);
		celular_ek1 = (TextView) findViewById(R.id.celular_ek1);
		entre_com_o_seu_email_ou_n_mero_de_celular_e_te_mandaremos_um_link_para_recuperar_a_sua_conta__ek1 = (TextView) findViewById(R.id.entre_com_o_seu_email_ou_n_mero_de_celular_e_te_mandaremos_um_link_para_recuperar_a_sua_conta__ek1);
		rectangle_103_ek4 = (View) findViewById(R.id.rectangle_103_ek4);
		enviar_ek1 = (TextView) findViewById(R.id.enviar_ek1);
		line_5_ek1 = (View) findViewById(R.id.line_5_ek1);
		line_6_ek1 = (View) findViewById(R.id.line_6_ek1);
		_volte_para_acessar_a_sua_conta_ek1 = (TextView) findViewById(R.id._volte_para_acessar_a_sua_conta_ek1);
		rectangle_103_ek5 = (View) findViewById(R.id.rectangle_103_ek5);
		n_mero_de_celular_ek1 = (TextView) findViewById(R.id.n_mero_de_celular_ek1);
		br__55 = (TextView) findViewById(R.id.br__55);
		line_7 = (View) findViewById(R.id.line_7);
	
		
		_dermagelogo_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), p_gina_inicial_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_email_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), recuperar_senha_email_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_volte_para_acessar_a_sua_conta_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), p_gina_inicial_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	