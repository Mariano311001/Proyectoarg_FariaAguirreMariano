import { Component, OnInit } from '@angular/core';
import { Experiencia } from 'src/app/model/experiencia';
import { SExperienciaService } from 'src/app/service/s-experiencia.service';
@Component({
  selector: 'app-edit-experiencia',
  templateUrl: './edit-experiencia.component.html',
  styleUrls: ['./edit-experiencia.component.css']
})
export class EditExperienciaComponent implements OnInit {
 expLab: Experiencia = null;
  constructor(private sExperiencia: SExperienciaService, private activatedRouter: ActivatedRouter, ) { }

  ngOnInit(): void {
  }

}
