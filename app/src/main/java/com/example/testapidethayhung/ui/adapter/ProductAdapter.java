package com.example.testapidethayhung.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testapidethayhung.R;
import com.example.testapidethayhung.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<Product> data;

    public ProductAdapter(List<Product> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product item = data.get(position);
        if (item != null) {
            if (item.getPid() % 2 == 0) {
                holder.star.setVisibility(View.VISIBLE);
            } else {
                holder.star.setVisibility(View.GONE);
            }
            holder.pid.setText("id: " + item.getPid() + "");
            holder.name.setText("name: " + item.getName());
            holder.price.setText("price: " + item.getPrice() + "");
            holder.createdAt.setText("createdAt: " + item.getCreated_at());
            holder.updatedAt.setText("updatedAt: " + item.getUpdated_at());
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView pid;
        private TextView name;
        private TextView price;
        private TextView createdAt;
        private TextView updatedAt;
        private ImageView star;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pid = (TextView) itemView.findViewById(R.id.pid);
            name = (TextView) itemView.findViewById(R.id.name);
            price = (TextView) itemView.findViewById(R.id.price);
            createdAt = (TextView) itemView.findViewById(R.id.created_at);
            updatedAt = (TextView) itemView.findViewById(R.id.updated_at);
            star = (ImageView) itemView.findViewById(R.id.star);

        }
    }
}
