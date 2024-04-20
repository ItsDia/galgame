package cn.wodemc.demo1;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.cutscene.Cutscene;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.scene.Scene;
import com.almasb.fxgl.ui.DialogBox;
import com.almasb.fxgl.ui.DialogService;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HelloApplication extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("GalGame");
        settings.setVersion("0.1");
        settings.setAppIcon("icon.jpg");
    }

    @Override
    protected void initGame() {
        FXGL.getGameWorld().addEntityFactory(new ChatAPP());
//        FXGL.getGameWorld().addEntityFactory(new DialogAPP());
        FXGL.spawn("bg");
//        FXGL.spawn("dialog");

        FXGL.runOnce(() -> {
            List<String> lines = FXGL.getAssetLoader().loadText("lines.txt");
            Cutscene cutscene = new Cutscene(lines);
            FXGL.getCutsceneService().startCutscene(cutscene);

            }, Duration.ZERO);
    }

    public static void main(String[] args) {
        launch(args);
    }
}