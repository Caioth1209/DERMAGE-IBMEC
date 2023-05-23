
	 
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
import android.widget.TextView;
import android.content.Intent;

public class p_gina_inicial_activity extends Activity {

	
	private View _bg__p_gina_inicial_ek2;
	private ImageView dermagelogo;
	private TextView acesse_a_sua_conta;
	private View rectangle_102;
	private TextView entrar;
	private TextView ou;
	private View rectangle_101;
	private TextView senha;
	private View rectangle_100;
	private TextView email_ou_n_mero_de_celular;
	private TextView _esqueceu_a_senha_;
	private View line_3;
	private TextView _n_o_tem_uma_conta__cadastre_se_;
	private View line_4;
	private ImageView face_1;
	private ImageView google_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.p_gina_inicial);

		
		_bg__p_gina_inicial_ek2 = (View) findViewById(R.id._bg__p_gina_inicial_ek2);
		dermagelogo = (ImageView) findViewById(R.id.dermagelogo);
		acesse_a_sua_conta = (TextView) findViewById(R.id.acesse_a_sua_conta);
		rectangle_102 = (View) findViewById(R.id.rectangle_102);
		entrar = (TextView) findViewById(R.id.entrar);
		ou = (TextView) findViewById(R.id.ou);
		rectangle_101 = (View) findViewById(R.id.rectangle_101);
		senha = (TextView) findViewById(R.id.senha);
		rectangle_100 = (View) findViewById(R.id.rectangle_100);
		email_ou_n_mero_de_celular = (TextView) findViewById(R.id.email_ou_n_mero_de_celular);
		_esqueceu_a_senha_ = (TextView) findViewById(R.id._esqueceu_a_senha_);
		line_3 = (View) findViewById(R.id.line_3);
		_n_o_tem_uma_conta__cadastre_se_ = (TextView) findViewById(R.id._n_o_tem_uma_conta__cadastre_se_);
		line_4 = (View) findViewById(R.id.line_4);
		face_1 = (ImageView) findViewById(R.id.face_1);
		google_1 = (ImageView) findViewById(R.id.google_1);
	
		
		_esqueceu_a_senha_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), recuperar_senha_email_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_n_o_tem_uma_conta__cadastre_se_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), criar_conta_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	