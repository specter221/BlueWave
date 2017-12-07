import { WorkflowComponent } from "./../workflow/workflow.component";
import { LoginHomeComponent } from "./../login-home/login-home.component";
import { HomeComponent } from "./../home/home.component";
import { async, ComponentFixture, TestBed } from "@angular/core/testing";
import {
  CreateWorkflowComponent,
  DialogOverviewDialog,
  WnameOverviewDialog,
  SettingsDialog,
  JsonEditor
} from "../create-workflow/create-workflow.component";
import { MaterialModule } from "../../modules/material.module";
import { AppRoutingModule } from "../../modules/app-routing.module";
import { BrowserModule } from "@angular/platform-browser";
import { ProfileComponent } from "../profile/profile.component";
import { ExecuteWorkflowComponent } from "../execute-workflow/execute-workflow.component";
import { GetReportComponent } from "../reports/reports.component";
import { ReactiveFormsModule, FormsModule } from "@angular/forms";
import { HttpModule } from "@angular/http";
import { NgxChartsModule } from "@swimlane/ngx-charts";
import { NgxChartsDagModule } from "@swimlane/ngx-charts-dag";
import { TagInputModule } from "ngx-chips";
import { Ng4JsonEditorModule } from "angular4-jsoneditor";
import { WorkflowDetailsService } from "../../services/workflow-details/workflow-details.service";
import { PerisitenceService } from "../../services/persistence/perisitence.service";
import { APP_BASE_HREF } from "@angular/common";
import { ReportService } from "../../services/report/report.service";
import { AuthGuardService } from "../../services/authentication/auth-guard.service";
import { AuthenticationService } from "../../services/authentication/authentication.service";
import { AppConfig } from "../../app.config";

describe("ReportsComponent", () => {
  let component: GetReportComponent;
  let fixture: ComponentFixture<GetReportComponent>;
 
  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [
          GetReportComponent
        ],
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(GetReportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it("should be created", () => {
    expect(component).toBeTruthy();
  });
});
