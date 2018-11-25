

package com.lazo.controlvehicularcsjpiu.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.lazo.controlvehicularcsjpiu.utils.utils;
/**
 * Create by LazoF 29/10/2018*/

public class ConexionSQLiteHelper extends SQLiteOpenHelper {


    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /* CREAR SCRIPTS*/
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(utils.CREAR_TABLA_USUARIO);
        db.execSQL(utils.CREAR_TABLA_PARAMETRO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        db.execSQL("DROP TABLE IF EXISTS parametros");
        onCreate(db);
    }


}


