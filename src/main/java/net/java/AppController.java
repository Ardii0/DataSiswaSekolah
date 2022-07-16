package net.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private DataSiswaService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<datasiswa> listDataSiswas = service.listAll();
        model.addAttribute("listDataSiswas", listDataSiswas);

        return "index";
    }

    // Add New Data...
    @RequestMapping("/new")
    public String showNewDataSiswaPage(Model model) {
        datasiswa datasiswa = new datasiswa();
        model.addAttribute("datasiswa", datasiswa);

        return "new_datasiswa";
    }

    // Save Data
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDataSiswa(@ModelAttribute("datasiswa") datasiswa datasiswa) {
        service.save(datasiswa);

        return "redirect:/";
    }

    // Edit Data
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditDataSiswa(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_DataSiswa");
        datasiswa datasiswa = service.get(id);
        mav.addObject("datasiswa", datasiswa);

        return mav;
    }

    // Delete Data
    @RequestMapping("/delete/{id}")
    public String deleteDataSiswa(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}