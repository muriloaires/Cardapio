package com.example.alunoinf.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alunoinf.myapplication.dummy.Prato;

import java.util.List;

/**
 * Created by alunoinf on 11/11/2014.
 */
public class AdapterPratos extends ArrayAdapter <Prato>
{
    private static final int layout = R.layout.item_prato;
    private LayoutInflater layoutInflater;
    private List<Prato> mPratos;

    public AdapterPratos(Context context, List<Prato> pratos) {
        super(context, layout);
        layoutInflater = LayoutInflater.from(context);
        mPratos = pratos;
    }

    static class ViewHolder  {
        public TextView txtNomePrato;
        public TextView txtPrecoPrato;
        public LinearLayout imagemPrato ;
    }

    public View getView(int position, View convertView,
                        ViewGroup viewGroup) {
        View listItemView = convertView;

        if(convertView == null) {
            listItemView = layoutInflater.inflate(layout, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.txtNomePrato = (TextView) listItemView.findViewById(R.id.txt_nome_prato);
            viewHolder.txtPrecoPrato = (TextView) listItemView.findViewById(R.id.txt_preco_prato);
            viewHolder.imagemPrato = (LinearLayout) listItemView.findViewById(R.id.imagem_prato);
            listItemView.setTag(viewHolder);
        }

        Prato prato = mPratos.get(position);

        ViewHolder holder = (ViewHolder) listItemView.getTag();

        holder.txtNomePrato.setText(prato.getNome());
        holder.txtPrecoPrato.setText(String.format("$1,.2f", prato.getPreco()));
        // TODO: Recurso local -> alterar para uma lib
        holder.imagemPrato.setBackgroundResource(prato.getImage());

        return listItemView;
    }
}
