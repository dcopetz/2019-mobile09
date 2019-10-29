package polinema.ac.id.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.tugasrecyclerview.adapters.MouseAdapter;
import polinema.ac.id.tugasrecyclerview.models.Mouse;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMouse;
    List<Mouse> mouseList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMouse = findViewById(R.id.rvMouse);

        Mouse mouse = new Mouse("Razer Mamba Wireless" , "Rp 1.600.000" ,R.drawable.mouserazer);
        mouseList.add(mouse);

        mouse = new Mouse("Steelseries Rival 650" , "Rp 1.750.000" ,R.drawable.mousestelseries);
        mouseList.add(mouse);

        mouse = new Mouse("Logitech G PRO Wireless" , "Rp 1.900.000" ,R.drawable.mouselogitech);
        mouseList.add(mouse);

        mouse = new Mouse("Sades Axe Rgb" , "Rp 325.000" ,R.drawable.mousesades);
        mouseList.add(mouse);

        mouse = new Mouse("Fantech X5s Zeus" , "Rp 150.000" ,R.drawable.mousefantech);
        mouseList.add(mouse);

        MouseAdapter mouseAdapter = new MouseAdapter(mouseList);
        rvMouse.setAdapter(mouseAdapter);
        rvMouse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        rvMouse.setLayoutManager(new GridLayoutManager(this,2));
    }
}
