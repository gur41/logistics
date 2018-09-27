package project.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.model.Maps;
import project.service.MapsService;

/**
 * Created by Roman on 18.09.2018.
 */
@Controller
public class MapsController {
    private MapsService mapsService;

    /*@Autowired(required = true)
    @Qualifier(value = "mapsService")*/
    public void setMapsService(MapsService mapsService) {
        this.mapsService = mapsService;
    }


    @RequestMapping(value = "/roma", method = RequestMethod.GET)
    public String gretting(Model model){
        model.addAttribute("roma", "Roma");
        return "roma";
    }


    @RequestMapping(value = "/maps", method = RequestMethod.GET)
    public String getAllMap(Model model){
        model.addAttribute("maps", new Maps());
        model.addAttribute("listMaps",this.mapsService.getAllMap());
        return "roma";
    }



    @RequestMapping(value = "maps/add", method = RequestMethod.POST)
    public String AddMap(@ModelAttribute("maps") Maps maps){
        if (maps.getIdMaps()!=0)
            this.mapsService.addMap(maps);
        else
            this.mapsService.updateMap(maps);

        return "redirect:/maps";

    }

    @RequestMapping(value = "delete/{id}")
    public String deleteMap(@PathVariable("id") int id) {
        this.mapsService.removeMap(id);

        return "redirect:/maps";
    }

    @RequestMapping("editMaps/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", this.mapsService.getMapById(id));
        model.addAttribute("listUsers", this.mapsService.getAllMap());

        return "roma";
    }

    @RequestMapping("maps/{id}")
    public String mapsData(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", this.mapsService.getMapById(id));

        return "users";
    }




}
