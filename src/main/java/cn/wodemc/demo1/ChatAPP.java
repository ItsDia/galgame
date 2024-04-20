package cn.wodemc.demo1;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;

public class ChatAPP implements EntityFactory {

    @Spawns("bg")
    public Entity newBg(SpawnData data)
    {
        return FXGL.entityBuilder(data)
                .view("bg.jpg")
                .build();
    }
}
