package pl.szymonchowaniec.repository;

import org.springframework.stereotype.Repository;
import pl.szymonchowaniec.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GifRepository {
    private List<Gif> allGifs = new ArrayList<>();

    public GifRepository() {
        allGifs.add(new Gif("android-explosion", true));
        allGifs.add(new Gif("compiler-bot", true));
        allGifs.add(new Gif("ben-and-mike", false));
        allGifs.add(new Gif("book-dominos", false));
        allGifs.add(new Gif("cowboy-coder", false));
        allGifs.add(new Gif("infinite-andrew", false));
    }

    public List<Gif> getAllGifs() {
        return allGifs;
    }
}
