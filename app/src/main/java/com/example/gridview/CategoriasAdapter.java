package com.example.gridview;

//import android.support.
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CategoriasAdapter extends BaseAdapter {
    private Context mContext;
    // Array que contiene las imágines a visualizar
   /* private Integer[] imagenes = {R.drawable.bebidas , R.drawable.carnes,
            R.drawable.congelados, R.drawable.embutidos, R.drawable.frutas,
            R.drawable.lacteos, R.drawable.panaderia, R.drawable.pescado,
            R.drawable.verduras};*/
    // Array que contiene los textos a mostrar
    private String[] categorias = {"Bebidas", "Carnes", "Congelados", "Embutidos", "Frutas",
            "Lacteos", "Panadería", "Pescado", "Verduras"};
    public CategoriasAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        //return imagenes.length;
        return 0;
    }
    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }
    // Crea un View para cada elemento
    public View getView (int position, View convertView, ViewGroup parent) {
        View miCelda = null;
        LayoutInflater inflater = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            // Si no existe el objeto lo creamos
            miCelda = new View(mContext);
            // "Inflamos" nuestro layout personalizado
            miCelda = inflater.inflate(R.layout.celda_grid, null);
            // Hacemos que en icono se muestre la imagen seleccionada
            //ImageView imageView = (ImageView) MiCelda.findViewById(R.id.icono);
           // imageView.setImageResource(imagenes[position]);
            // Hacemos que en texto se visualice la cadena correspondiente
           // TextView textView = (TextView) MiCelda.findViewById(R.id.texto);
            //textView.setText(categorias[position]);
        } else {
           // MiCelda = (View) convertView;
        }

        //return MiCelda;
        final View miCelda1 = miCelda;
        return miCelda1;
    }
} 