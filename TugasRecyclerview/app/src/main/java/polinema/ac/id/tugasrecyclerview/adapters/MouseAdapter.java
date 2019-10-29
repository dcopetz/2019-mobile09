package polinema.ac.id.tugasrecyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import polinema.ac.id.tugasrecyclerview.R;
import polinema.ac.id.tugasrecyclerview.models.Mouse;

public class MouseAdapter extends RecyclerView.Adapter<MouseAdapter.MyView> {
    List<Mouse> mouseList;

    public MouseAdapter(List<Mouse> mouseList) {
        this.mouseList = mouseList;
    }

    @NonNull
    @Override
    public MouseAdapter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View mouseView = layoutInflater.inflate(R.layout.item_mouse,parent,false);
        MyView viewHolder = new MyView(mouseView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MouseAdapter.MyView holder, int position) {
        Mouse mouse = mouseList.get(position);
        holder.nama.setText(mouse.getNamaMouse());
        holder.detail.setText(mouse.getDetailMouse());
        holder.gambar.setImageResource(mouse.getMouse());
    }

    @Override
    public int getItemCount() {
        return (mouseList != null ? mouseList.size() : 0);
    }

    public class MyView extends RecyclerView.ViewHolder {
        public TextView nama;
        public TextView detail;
        public ImageView gambar;
        public MyView(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namaA);
            detail = itemView.findViewById(R.id.detailA);
            gambar = itemView.findViewById(R.id.gambarA);
        }
    }
}