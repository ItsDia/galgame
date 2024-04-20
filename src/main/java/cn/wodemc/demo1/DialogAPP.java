package cn.wodemc.demo1;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;

public class DialogAPP implements EntityFactory {
    @Spawns("dialog")
    public Entity newDialog(SpawnData data)
    {
        return FXGL.entityBuilder(data)
                .view("dialogbg.jpg")
                .build();
    }
}
