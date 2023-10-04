package eb.TheOfficeRandomGenerator.payloads.mappers;

import eb.TheOfficeRandomGenerator.entity.Episodes;
import eb.TheOfficeRandomGenerator.payloads.response.EpisodesResponse;
import org.springframework.stereotype.Component;

@Component
public class EpisodeMapper
{
    public EpisodesResponse mapEpisodeToEpisodeResponse(Episodes episodes)
    {
        return EpisodesResponse.builder()
                .id(episodes.getId())
                .episodeDescription(episodes.getEpisodeDescription())
                .episodeName(episodes.getEpisodeName())
                .episodeNumber(episodes.getEpisodeNumber())
                .season(episodes.getSeason())
                .imgUrl(episodes.getImgUrl())
                .build();
    }
}
