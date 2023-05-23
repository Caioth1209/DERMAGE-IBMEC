
	 
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

public class recuperar_senha_email_activity extends Activity {

	
	private View _bg__recuperar_senha_email_ek2;
	private ImageView _dermagelogo_ek2;
	private View rectangle_56_ek1;
	private TextView esqueceu_a_senha__ek1;
	private View rectangle_103_ek2;
	private TextView email_ek1;
	private TextView email_ek2;
	private TextView _celular;
	private TextView entre_com_o_seu_email_ou_n_mero_de_celular_e_te_mandaremos_um_link_para_recuperar_a_sua_conta_;
	private View rectangle_103_ek3;
	private TextView enviar;
	private View line_5;
	private View line_6;
	private TextView _volte_para_acessar_a_sua_conta;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.recuperar_senha_email);

		
		_bg__recuperar_senha_email_ek2 = (View) findViewById(R.id._bg__recuperar_senha_email_ek2);
		_dermagelogo_ek2 = (ImageView) findViewById(R.id._dermagelogo_ek2);
		rectangle_56_ek1 = (View) findViewById(R.id.rectangle_56_ek1);
		esqueceu_a_senha__ek1 = (TextView) findViewById(R.id.esqueceu_a_senha__ek1);
		rectangle_103_ek2 = (View) findViewById(R.id.rectangle_103_ek2);
		email_ek1 = (TextView) findViewById(R.id.email_ek1);
		email_ek2 = (TextView) findViewById(R.id.email_ek2);
		_celular = (TextView) findViewById(R.id._celular);
		entre_com_o_seu_email_ou_n_mero_de_celular_e_te_mandaremos_um_link_para_recuperar_a_sua_conta_ = (TextView) findViewById(R.id.entre_com_o_seu_email_ou_n_mero_de_celular_e_te_mandaremos_um_link_para_recuperar_a_sua_conta_);
		rectangle_103_ek3 = (View) findViewById(R.id.rectangle_103_ek3);
		enviar = (TextView) findViewById(R.id.enviar);
		line_5 = (View) findViewById(R.id.line_5);
		line_6 = (View) findViewById(R.id.line_6);
		_volte_para_acessar_a_sua_conta = (TextView) findViewById(R.id._volte_para_acessar_a_sua_conta);
	
		
		_dermagelogo_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), p_gina_inicial_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_celular.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), recuperar_senha_celular_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_volte_para_acessar_a_sua_conta.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), p_gina_inicial_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	