
	 
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

public class criar_conta_activity extends Activity {

	
	private View _bg__criar_conta_ek2;
	private ImageView _dermagelogo_ek1;
	private View rectangle_56;
	private TextView criar_uma_conta;
	private View rectangle_103;
	private TextView nome_completo;
	private View rectangle_100_ek1;
	private TextView nome_de_usu_rio;
	private View _rectangle_103_ek1;
	private TextView confirmar;
	private TextView _j__tem_uma_conta__entre_;
	private TextView email;
	private View rectangle_104;
	private TextView n_mero_de_celular;
	private View rectangle_105;
	private TextView data_de_nascimento;
	private View rectangle_108;
	private View rectangle_109;
	private View rectangle_110;
	private TextView dia;
	private TextView m_s;
	private TextView ano;
	private ImageView _38483_removebg_preview_1;
	private ImageView _38483_removebg_preview_2;
	private ImageView _38483_removebg_preview_3;
	private TextView senha_ek1;
	private TextView confirmar_senha;
	private View rectangle_106;
	private View rectangle_107;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.criar_conta);

		
		_bg__criar_conta_ek2 = (View) findViewById(R.id._bg__criar_conta_ek2);
		_dermagelogo_ek1 = (ImageView) findViewById(R.id._dermagelogo_ek1);
		rectangle_56 = (View) findViewById(R.id.rectangle_56);
		criar_uma_conta = (TextView) findViewById(R.id.criar_uma_conta);
		rectangle_103 = (View) findViewById(R.id.rectangle_103);
		nome_completo = (TextView) findViewById(R.id.nome_completo);
		rectangle_100_ek1 = (View) findViewById(R.id.rectangle_100_ek1);
		nome_de_usu_rio = (TextView) findViewById(R.id.nome_de_usu_rio);
		_rectangle_103_ek1 = (View) findViewById(R.id._rectangle_103_ek1);
		confirmar = (TextView) findViewById(R.id.confirmar);
		_j__tem_uma_conta__entre_ = (TextView) findViewById(R.id._j__tem_uma_conta__entre_);
		email = (TextView) findViewById(R.id.email);
		rectangle_104 = (View) findViewById(R.id.rectangle_104);
		n_mero_de_celular = (TextView) findViewById(R.id.n_mero_de_celular);
		rectangle_105 = (View) findViewById(R.id.rectangle_105);
		data_de_nascimento = (TextView) findViewById(R.id.data_de_nascimento);
		rectangle_108 = (View) findViewById(R.id.rectangle_108);
		rectangle_109 = (View) findViewById(R.id.rectangle_109);
		rectangle_110 = (View) findViewById(R.id.rectangle_110);
		dia = (TextView) findViewById(R.id.dia);
		m_s = (TextView) findViewById(R.id.m_s);
		ano = (TextView) findViewById(R.id.ano);
		_38483_removebg_preview_1 = (ImageView) findViewById(R.id._38483_removebg_preview_1);
		_38483_removebg_preview_2 = (ImageView) findViewById(R.id._38483_removebg_preview_2);
		_38483_removebg_preview_3 = (ImageView) findViewById(R.id._38483_removebg_preview_3);
		senha_ek1 = (TextView) findViewById(R.id.senha_ek1);
		confirmar_senha = (TextView) findViewById(R.id.confirmar_senha);
		rectangle_106 = (View) findViewById(R.id.rectangle_106);
		rectangle_107 = (View) findViewById(R.id.rectangle_107);
	
		
		_dermagelogo_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), p_gina_inicial_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_103_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), p_gina_inicial_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_j__tem_uma_conta__entre_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), p_gina_inicial_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	