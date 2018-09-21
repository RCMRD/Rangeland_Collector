package com.servir.rangelandscollector.former;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.servir.rangelandscollector.Utils.Constantori;
import com.servir.rangelandscollector.Utils.DatabaseHandler;

public class Colecta extends AppCompatActivity {
	
	/*Button rudi;
	Button tuma;
	Button btnfoto;
	//String datno, sax, say, s001, s002, s003, s004, s006, s007, s008, s031, s0312,s0313, s005,s02x,s04x ;
	String datno = "";
	String s001 = "";
	String sax = "";
	String say = "";
	String s007 = "";
	String syes = "Accessible";
	String sno = "Inaccessible";
	View View;
	DatabaseHandler db = DatabaseHandler.getInstance(this);
	ArrayAdapter<String> spinnerArrayAdapter;
	//Spinner	s6,s3, s31, s312, s313, s2x, s4x;
	//EditText s2, s4, s7, s8, s87;
	EditText  s7, s87;
	TextView s1;
	//RadioButton neww, prevv;
	String picnm;
	String refo;
	Context context = this;
	String naniask = "";
    String lepicnm;
    File f;
    String taken = "nope";
    int erer = 0;
	String lepicpath;
	ImageView sceneimage;
	private final static int PICTURE_STUFF = 1;
	private final static int REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS = 13;

	private Uri fileUri;
		
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kolek);
        overridePendingTransition(0,0);

		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setIcon(R.mipmap.ic_launcher);

		if (Build.VERSION.SDK_INT < 23) {

		}else {
				reqPermission("top");
		}



		rudi = (Button) findViewById (R.id.backo);
        tuma = (Button) findViewById (R.id.doneo);
		sceneimage = (ImageView) findViewById(R.id.s12pic); 
        
        s1= (TextView) findViewById (R.id.s1);
        *//*s6= (Spinner) findViewById (R.id.s6);
        *//*
        s7= (EditText) findViewById (R.id.s7);
		s87= (EditText) findViewById (R.id.s87);
        
       *//* neww = (RadioButton) findViewById(R.id.neww);
		prevv = (RadioButton) findViewById(R.id.prevv);*//*
		btnfoto = (Button) findViewById(R.id.bfopic);

		
    
         Intent intentqa = getIntent();
		sax = intentqa.getStringExtra("lonnn");
		Intent intentqasp = getIntent();
		s001 = intentqasp.getStringExtra("lu");
		 Intent intentqsa = getIntent();
		 say = intentqsa.getStringExtra("lattt");
		 Intent intentqdsa = getIntent();
		 datno = intentqdsa.getStringExtra("datno");



		doDBStuff("getRefo");
		doDBStuff("Entered");


		*//*s31.setOnItemSelectedListener(new OnItemSelectedListener() {


           
     		
			public void onItemSelected(AdapterView<?> arg0,
					android.view.View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				String mm = s31.getSelectedItem().toString();
				
	 	       if (mm.equals("Other")){
	 	    	   s8.setEnabled(true);
	 	       }else{
	 	    	  s8.setText("");
	 	    	  s8.setEnabled(false);
	 	       }
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}

     	});*//*
       
       
       btnfoto.setOnClickListener(new OnClickListener(){
	    	
	    	public void onClick(View view){

				if (Build.VERSION.SDK_INT < 23) {
					PigaPicha();
				} else {

					if (
							ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
									ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_NETWORK_STATE) == PackageManager.PERMISSION_GRANTED &&
									ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
									ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED

							) {

						PigaPicha();

					} else {

						reqPermission("anaingia");

					}


				}





					}

	      });
       
       
    rudi.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View view){
        		Intent intent = new Intent (context, Selekta.class);
				intent.putExtra("lattt", say);
				intent.putExtra("lonnn", sax);
				intent.putExtra("datno", datno);
				startActivity(intent);
        	}
    });
    
        	
    tuma.setOnClickListener(new OnClickListener(){
             	
             	public void onClick(View view){
             	
                  //s001 = s1.getSelectedItem().toString().trim();

					if (s001.equals("Other")){
						s001 = s87.getText().toString().trim();
					}

             		if(s7.getText().toString().trim().length() == 0){
       		    		s007 = "None";
					  }else{
						s007 = s7.getText().toString().trim();
					}



       		      	s007 = s7.getText().toString().trim();




       		      
       		    *//*  if (s031.equals("Other")){
       		    	  s031 = s008;
       		      }
       		      
       		      if (neww.isChecked()){
       		    	  s005 = sno;
       		      }else if (prevv.isChecked()){
       		    	  s005 = syes;
       		      }*//*
       		      



       		if(s1.getText().toString().trim().equals("Other") &&
				s87.getText().toString().equals("")) {

				Toast.makeText(context, "Please specify land cover class", Toast.LENGTH_LONG).show();

			}else{
       			
       			   *//*if (!s1.getSelectedItem().toString().equals("Dam")){
       				   s017 = "N/A";
       			   }*//*
       				
       				*//*s002 = s002 + " " + s02x;
       				s004 = s004 + " " + s04x;*//*

				Map<String,String> submap = new HashMap<String, String>();

				submap.put(Constantori.KEY_DATNO, datno);
				submap.put(Constantori.KEY_DATFEATURE,s001);
				submap.put(Constantori.KEY_DATCOMMENT,s007);
				submap.put(Constantori.KEY_DATLON,sax);
				submap.put(Constantori.KEY_DATLAT,say);
				submap.put(Constantori.KEY_DATPICNAME,picnm);
				submap.put(Constantori.KEY_DATSTATUS,Constantori.SAVE_DATSTATUS);
				submap.put(Constantori.KEY_USERREF, refo);

				if (db.CheckIsDataAlreadyInDBorNot(Constantori.TABLE_DAT, Constantori.KEY_DATNO, datno)){
					db.KolekData_UpdateAll(Constantori.getJSON(submap));
				}else{
					db.KolekData_InsertAll(Constantori.getJSON(submap));
				}

				Map<String,String> submap2 = new HashMap<String, String>();


				submap2.put(Constantori.KEY_USERPIC,picnm);
				submap2.put(Constantori.KEY_USERPICPATH,lepicpath);
				submap2.put(Constantori.KEY_SENDSTAT,Constantori.SAVE_PICSTATUS);

				db.PicData_InsertAll(Constantori.getJSON(submap2));

				diambaids(View);

       		}
             		
             	}
    });   

       
    }
	
	@Override
	public void onBackPressed(){
		
	}
	
	
	public void diambaids(View v) {
		final Dialog mbott = new Dialog(context, android.R.style.Theme_Translucent_NoTitleBar);
		mbott.setContentView(R.layout.mbaind_sav);
		mbott.setCanceledOnTouchOutside(false);
		mbott.setCancelable(false);
		WindowManager.LayoutParams lp = mbott.getWindow().getAttributes();
		lp.dimAmount=0.85f;
		mbott.getWindow().setAttributes(lp);
		mbott.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
		mbott.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
		
		Button mbaok = (Button) mbott.findViewById(R.id.mbabtn1);
		mbaok.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				

				s7.setText("");
				*//*s1.setSelection(0);
				neww.setChecked(true);*//*
				
				Intent intent = new Intent (context, MainActivity.class);
	        	startActivity(intent);
				
	            
					mbott.dismiss();
			}
		});
		mbott.show();
	}

	 private void saveImage(Bitmap finalBitmap) {

         String root = Environment.getExternalStorageDirectory().getAbsolutePath() + "/IMGLULC";
         File myDir = new File(root);

         if (!myDir.exists()) {
         	myDir.mkdirs();
         }

		 picnm = datno +   ".jpg";
		 Log.e("aaaaaaaaa", datno);
         File file = new File(myDir, picnm);

         if (file.exists()) {
			 file.delete();
		 }

         try {
             FileOutputStream out = new FileOutputStream(file);
             finalBitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);
             out.flush();
             out.close();
             
             taken = "yap";
             erer = 1;

			 if (file.exists()) {
				 Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
				 sceneimage.setImageBitmap(bitmap);
				 lepicpath = file.getAbsolutePath();
			 }


             
             }
         catch (Exception e) {
        	 Toast.makeText(context, "Camera error, take photograph again.", Toast.LENGTH_LONG ).show();
             e.printStackTrace();
         }

         // Tell the media scanner about the new file so that it is
         // immediately available to the user.
         MediaScannerConnection.scanFile(this, new String[] { file.toString() }, null,
                 new MediaScannerConnection.OnScanCompletedListener() {
                     public void onScanCompleted(String path, Uri uri) {
                         
                     }
         });

       
     }
     


	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		 if (requestCode==PICTURE_STUFF && resultCode == RESULT_OK){



				Bitmap bitmap;

				BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
			    bitmapOptions.inJustDecodeBounds= false;
				bitmap = BitmapFactory.decodeFile(f.getAbsolutePath(), bitmapOptions);
				MediaStore.Images.Media.insertImage(getContentResolver(),
						bitmap,
						String.valueOf(System.currentTimeMillis()),
						"Description");
				saveImage(bitmap);

				String root2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/IMGLULC";
				File myDir2 = new File(root2);
				File file2 = new File(myDir2, "temp.jpg");
				if (file2.exists()){
					file2.delete();
				}

		}


	}


	private File createImageFile() throws IOException {
		// Create an image file name

		String root = Environment.getExternalStorageDirectory().getAbsolutePath() +"/IMGLULC";
		File myDir = new File(root);

		if (!myDir.exists()) {
			myDir.mkdirs();
		}

		picnm = "temp";



		File image = File.createTempFile(
				picnm,
				".jpg",
				myDir
		);

		f = image;


		return f;
	}

	*//**
	 * Here we store the file url as it will be null after returning from camera
	 * app
	 *//*
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		// save file url in bundle as it will be null on scren orientation
		// changes
		try {
			outState.putParcelable("file_uri", fileUri);
		}catch (Exception ss){

		}
	}

	*//*
    * Here we restore the fileUri again
    *//*
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);

		// get the file url
		try{
			fileUri = savedInstanceState.getParcelable("file_uri");
		}catch (Exception ss){

		}
	}

	@SuppressLint("NewApi")
	private void reqPermission(final String nini) {

		naniask = nini;

		List<String> permissionsNeeded = new ArrayList<String>();
		final List<String> permissionsList = new ArrayList<String>();

		if (!addPermission(permissionsList, Manifest.permission.ACCESS_FINE_LOCATION))
			permissionsNeeded.add("Location");
		if (!addPermission(permissionsList, Manifest.permission.WRITE_EXTERNAL_STORAGE))
			permissionsNeeded.add("Storage");
		if (!addPermission(permissionsList, Manifest.permission.CAMERA))
			permissionsNeeded.add("Camera");
		if (!addPermission(permissionsList, Manifest.permission.READ_PHONE_STATE))
			permissionsNeeded.add("Cell Network");

		if (permissionsList.size() > 0) {
			if (permissionsNeeded.size() > 0) {
				// Need Rationale
				String message = "This application needs to access your " + permissionsNeeded.get(0);
				for (int i = 1; i < permissionsNeeded.size(); i++)
					message = message + ", " + permissionsNeeded.get(i);
				showMessageOKCancel(message,
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								requestPermissions(permissionsList.toArray(new String[permissionsList.size()]),
										REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS);
							}
						});
				return;
			}
			requestPermissions(permissionsList.toArray(new String[permissionsList.size()]),
					REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS);
			return;
		}

		return;

	}

	@SuppressLint("NewApi")
	private boolean addPermission(List<String> permissionsList, String permission) {
		if (checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
			permissionsList.add(permission);
			// Check for Rationale Option
			if (!shouldShowRequestPermissionRationale(permission))
				return false;
		}
		return true;
	}

	private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {
		new AlertDialog.Builder(context)
				.setMessage(message)
				.setPositiveButton("OK", okListener)
				.setNegativeButton("Cancel", null)
				.create()
				.show();
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		switch (requestCode) {
			case REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS:
			{
				Map<String, Integer> perms = new HashMap<String, Integer>();
				// Initial
				perms.put(Manifest.permission.ACCESS_FINE_LOCATION, PackageManager.PERMISSION_GRANTED);
				perms.put(Manifest.permission.WRITE_EXTERNAL_STORAGE, PackageManager.PERMISSION_GRANTED);
				perms.put(Manifest.permission.CAMERA, PackageManager.PERMISSION_GRANTED);
				perms.put(Manifest.permission.READ_PHONE_STATE, PackageManager.PERMISSION_GRANTED);
				// Fill with results
				for (int i = 0; i < permissions.length; i++)
					perms.put(permissions[i], grantResults[i]);
				// Check for ACCESS_FINE_LOCATION
				if (perms.get(
						Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
						&& perms.get(Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED
						&& perms.get(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
						&& perms.get(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
						) {
					// All Permissions Granted
					if (naniask.equals("Camera")) {
						PigaPicha();
					}
						Toast.makeText(context, "Permissions enabled", Toast.LENGTH_LONG).show();

				} else {
					// Permission Denied
					Toast.makeText(context, "Some Permission is Denied", Toast.LENGTH_SHORT)
							.show();
				}
			}
			break;
			default:
				super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		}
	}

	private void PigaPicha() {

        String tempopic = Environment.getExternalStorageDirectory().getAbsolutePath() + "/IMGLULC";

		if (Build.VERSION.SDK_INT < 23) {



			Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			f = new File(tempopic, "temp.jpg");
			intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
			startActivityForResult(intent, PICTURE_STUFF);

		} else {

			try {
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				intent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", createImageFile()));
				startActivityForResult(intent, PICTURE_STUFF);

			} catch (Exception zz) {
				Log.e("camera", zz.getMessage());
				Toast.makeText(context, "Please enable permissions for camera", Toast.LENGTH_LONG).show();
			}
		}
	}

	private void doDBStuff(String where){

		switch (where){

			case "getRefo":

				if (db.CheckIsDataAlreadyInDBorNot(Constantori.TABLE_REGISTER, Constantori.KEY_USERACTIVE, Constantori.USERACTIVE)) {

					List<HashMap<String, String>> regData = db.GetAllData(Constantori.TABLE_REGISTER, "", "");

					HashMap<String, String> UserDetails = regData.get(0);


					refo = UserDetails.get(Constantori.KEY_USERREF);


				}

				break;

			case "Entered":

				if (db.CheckIsDataAlreadyInDBorNot(Constantori.TABLE_DAT, Constantori.KEY_DATNO, datno) && db.CheckIsDataAlreadyInDBorNot(Constantori.TABLE_DAT, Constantori.KEY_USERREF, refo)) {

					List<HashMap<String, String>> allData = db.GetAllData(Constantori.TABLE_DAT, Constantori.KEY_DATNO, datno);

					HashMap<String, String> allDetails = allData.get(0);

					s1.setText((allDetails.get(Constantori.KEY_DATFEATURE)));
					s7.setText((allDetails.get(Constantori.KEY_DATCOMMENT)));

					*//*

					for (int i=0; i < in2.getAdapter().getCount(); i++ ){
						if (NursDetails.get(db.KEY_NURSERYYR).trim().equals(in2.getAdapter().getItem(i).toString())){
							in2.setSelection(i);
							break;
						}
					}

					in6.setText(NursDetails.get(db.KEY_NURSERYTEL));

					*//*


				}else{

					s1.setText(s001);

					if (!s001.equals("Other")){
						s87.setText("");
						s87.setEnabled(false);
					}else{
						s87.setEnabled(true);
					}

				}

				break;

			default:
				//System.out.println("Uuuuuwi");
				break;

		}

	}*/

}
