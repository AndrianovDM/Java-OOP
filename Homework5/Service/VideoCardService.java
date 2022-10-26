package Homework5.Service;

import java.util.List;

import Homework5.Data.VideoCard;

public class VideoCardService implements Filter<VideoCard>{
    @Override
    public VideoCard getFilteredDetails(List<VideoCard> arrList, String filter){
        VideoCard val = null;
        for (var item : arrList) {
            if (item.getName().equals(filter)) {
                val = item;
            } else if (item.getRetention().equals(filter)) {
                val = item;
            } else if (item.getProcreator().equals(filter)) {
                val = item;
            }
        }
        return val;
    }
}