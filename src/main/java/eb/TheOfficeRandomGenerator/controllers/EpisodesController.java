package eb.TheOfficeRandomGenerator.controllers;

import eb.TheOfficeRandomGenerator.payloads.response.EpisodesResponse;
import eb.TheOfficeRandomGenerator.service.EpisodesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/episodes")
@RequiredArgsConstructor
public class EpisodesController
{
    private final EpisodesService episodesService;

    @GetMapping
    public ResponseEntity<EpisodesResponse> generateRandomEpisode()
    {
        return ResponseEntity.ok(episodesService.generateRandomEpisode());
    }
}
