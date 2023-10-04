package eb.TheOfficeRandomGenerator.service;

import eb.TheOfficeRandomGenerator.entity.Episodes;
import eb.TheOfficeRandomGenerator.payloads.mappers.EpisodeMapper;
import eb.TheOfficeRandomGenerator.payloads.response.EpisodesResponse;
import eb.TheOfficeRandomGenerator.repository.EpisodesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class EpisodesService
{
    private final EpisodesRepository episodesRepository;
    private final EpisodeMapper episodeMapper;


    public EpisodesResponse generateRandomEpisode()
    {
        Random random = new Random();
        Long randomEpisode = random.nextLong(1,189);
        Episodes randomGeneratedEpisode = episodesRepository.getById(randomEpisode);

        return episodeMapper.mapEpisodeToEpisodeResponse(randomGeneratedEpisode);
    }
}
