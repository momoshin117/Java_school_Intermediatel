import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MenuManager {
    // ここにフィールドを追加します。
    HashMap<String, ArrayList> map = new HashMap<>();

    // コンストラクタ
    MenuManager() {
        // サンドイッチメニューの登録
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch", list);
        // ドリンクメニューの登録
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink", list);
        // サイドメニューの登録
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu", list);
    }

    // ここにsearchMenuを作成します。
    public void searchMenu(String menu) {

        String[] key = map.keySet().toArray(new String[0]);
        ArrayList[] value = map.values().toArray(new ArrayList[0]);

        int z = 0;

        for (int i = 0; i < map.size(); i++) {
            if (z == 0) {
                Iterator iterator = value[i].iterator();
                String[] entry = new String[3];

                for (int j = 0; j < entry.length; j++) {
                    entry[j] = iterator.next().toString();
                    if (entry[j] == menu) {
                        System.out.println(menu + "は" + key[i] + "に含まれています。");
                        z++;
                        break;
                    }
                }
            }
        }
        if (z == 0) {
            System.out.println("該当するメニューはありません。");
        }
    }

    // ここにsetMenuを作成します。
    public void setMenu(String category, String menu) {
        ArrayList<String> list = map.get(category);
        list.add(menu);

        map.put(category, list);
    }

    // ここにshowMenuを作成します。
    public void showMenu(String category) {
        System.out.println(map.get(category));
    }

}